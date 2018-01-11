/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ilhamprasetyo.latihanmvcjdbc.main;

import edu.ilhamprasetyo.latihanmvcjdbc.database.KingsBarbershopDatabase;
import edu.ilhamprasetyo.latihanmvcjdbc.entity.Pelanggan;
import edu.ilhamprasetyo.latihanmvcjdbc.error.PelangganException;
import edu.ilhamprasetyo.latihanmvcjdbc.service.PelangganDAO;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Alaba
 * NIM : 10116496
 * Nama :Ilham Prasetyo
 * Kelas : PBO-11
 */
public class LatihanCRUDMVCDAO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, PelangganException {
        // TODO code application logic here

        //  KingsBarbershopDatabase.getConnection();
        PelangganDAO dao = KingsBarbershopDatabase.getPelangganDAO();
        dao.deletePelanggan(1);

    }

}
