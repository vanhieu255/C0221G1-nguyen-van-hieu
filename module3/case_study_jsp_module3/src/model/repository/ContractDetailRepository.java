package model.repository;

import model.bean.Contract;
import model.bean.ContractDetail;
import model.bean.ServiceAttach;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContractDetailRepository {
    BaseRepository baseRepository=new BaseRepository();
    private static final String SELECT_ALL_CONTRACTDETAIL = "select * from hop_dong_chi_tiet";
    private static final String SELECT_ALL_CONTRACT= "select id_hop_dong from hop_dong";
    private static final String SELECT_ALL_SERVICE_ATTRACH = "select id_dich_vu_di_kem,ten_dich_vu_di_kem from dich_vu_di_kem";
    private static final String INSERT_CONTRACTDETAIL = "INSERT INTO hop_dong_chi_tiet" +
            "  (id_hop_dong_chi_tiet,id_hop_dong,id_dich_vu_di_kem,so_luong) VALUES " +
            " (?, ?, ?,?);";

    public List<ContractDetail> findAll() {
        List<ContractDetail> contractDetails =new ArrayList<>();
        try  {
            Connection connection = baseRepository.connectDataBase();

            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_CONTRACTDETAIL);
            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            ResultSet rs = preparedStatement.executeQuery();

            // Step 4: Process the ResultSet object.
            while (rs.next()) {
                int idHopDongChiTiet= rs.getInt("id_hop_dong_chi_tiet");
                int idHopDong= rs.getInt("id_hop_dong");
                int idDichVuDiKem= rs.getInt("id_dich_vu_di_kem");
                int soLuong=rs.getInt("so_luong");

                contractDetails.add(new ContractDetail(idHopDongChiTiet,idHopDong,idDichVuDiKem,soLuong));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return contractDetails;

    }
    public List<Contract> findAllContract() {
        List<Contract> contracts =new ArrayList<>();
        try  {
            Connection connection = baseRepository.connectDataBase();

            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_CONTRACT);
            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            ResultSet rs = preparedStatement.executeQuery();

            // Step 4: Process the ResultSet object.
            while (rs.next()) {
                int idHopDong= rs.getInt("id_hop_dong");
                contracts.add(new Contract(idHopDong));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return contracts;
    }
    public List<ServiceAttach> findAllServiceAttach() {
        List<ServiceAttach> serviceAttaches=new ArrayList<>();
        try  {
            Connection connection = baseRepository.connectDataBase();

            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_SERVICE_ATTRACH);
            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            ResultSet rs = preparedStatement.executeQuery();

            // Step 4: Process the ResultSet object.
            while (rs.next()) {
                int idDichVuDiKem= rs.getInt("id_dich_vu_di_kem");
                String tenDichVuDiKem=rs.getString("ten_dich_vu_di_kem");
                serviceAttaches.add(new ServiceAttach(idDichVuDiKem,tenDichVuDiKem));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return serviceAttaches;
    }
    public void save(ContractDetail contractDetail) throws SQLException {
        System.out.println(INSERT_CONTRACTDETAIL);
        // try-with-resource statement will auto close the connection.
        try (Connection connection = baseRepository.connectDataBase(); PreparedStatement preparedStatement = connection.prepareStatement(INSERT_CONTRACTDETAIL)) {
            preparedStatement.setInt(1, contractDetail.getIdHopDongChiTiet());
            preparedStatement.setInt(2, contractDetail.getIdHopDong());
            preparedStatement.setInt(3, contractDetail.getIdDichVuDiKem());
            preparedStatement.setInt(4, contractDetail.getSoLuong());
            System.out.println(preparedStatement);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
