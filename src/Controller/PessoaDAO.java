/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import Conection.conexao;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Pessoa;


public class PessoaDAO {
    //Classe de controle de dados
    public void create(Pessoa p) {
        //Criação de novo cadastro
        Connection con = conexao.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO cadastro_pessoas (nome,sobrenome,datanascimento)VALUES(?,?,?)");
            stmt.setString(1, p.getNome());
            stmt.setString(2, p.getSobrenome());
            stmt.setString(3, p.getDatanascimento());

            stmt.executeUpdate();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar" + ex);
        } finally {
            conexao.closeConnection(con, (com.mysql.jdbc.PreparedStatement) stmt);
        }
    }

    
    public List<Pessoa> read() {
        //Leitura dos dados
        Connection con = conexao.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Pessoa> pessoas = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT *FROM cadastro_pessoas");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Pessoa pessoa = new Pessoa();

                pessoa.setId(rs.getInt("id"));
                pessoa.setNome(rs.getString("nome"));
                pessoa.setSobrenome(rs.getString("sobrenome"));
                pessoa.setDatanascimento(rs.getString("datanascimento"));
                pessoas.add(pessoa);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao ler pessoa!!" + ex);
        } finally {
            conexao.closeConnection(con, (com.mysql.jdbc.PreparedStatement) stmt);
        }

        return pessoas;

    }

    
    
    public void update(Pessoa p) {
        //atualização de cadastro
        Connection con = conexao.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("UPDATE cadastro_pessoas SET nome = ? ,sobrenome = ? ,datanascimento = ? WHERE id = ?");
            stmt.setString(1, p.getNome());
            stmt.setString(2, p.getSobrenome());
            stmt.setString(3, p.getDatanascimento());
            stmt.setInt(4, p.getId());

            stmt.executeUpdate();
            stmt.close();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar" + ex);
        } finally {
            conexao.closeConnection(con, (com.mysql.jdbc.PreparedStatement) stmt);
        }
    }

    public void delete(Pessoa p) {
        //Exclusão de cadastro
        Connection con = conexao.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM cadastro_pessoas WHERE id = ?");
            stmt.setInt(1, p.getId());

            stmt.executeUpdate();
            stmt.close();
            JOptionPane.showMessageDialog(null, "Excluido com sucesso");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Excluir" + ex);
        } finally {
            conexao.closeConnection(con, (com.mysql.jdbc.PreparedStatement) stmt);
        }
    }

}
