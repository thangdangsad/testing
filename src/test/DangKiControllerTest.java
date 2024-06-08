package test;

import Config.SQLServerConnect;
import controllers.DangKiController;
import org.junit.Before;
import org.junit.Test;
import org.junit.platform.commons.annotation.Testable;
import org.mockito.Mockito;
import views.DangKiView;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
@Testable
class DangKiControllerTest {

    private DangKiView mockView;
    private SQLServerConnect mockSQLServerConnect;
    private Connection mockConnection;
    private PreparedStatement mockPreparedStatement;
    private DangKiController dangKiController;

    @Before
    public void setUp() throws SQLException {
        // Mock các đối tượng cần thiết
        mockView = Mockito.mock(DangKiView.class);
        mockSQLServerConnect = Mockito.mock(SQLServerConnect.class);
        mockConnection = Mockito.mock(Connection.class);
        mockPreparedStatement = Mockito.mock(PreparedStatement.class);

        // Thiết lập hành vi của các mock
        when(mockSQLServerConnect.connect()).thenReturn(mockConnection);
        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);

        // Khởi tạo controller với các mock
        dangKiController = new DangKiController();
        dangKiController.dangKiView = mockView;
        dangKiController.sqlServerConnect = mockSQLServerConnect;
        dangKiController.connection = mockConnection;
    }

    @Test
    public void testBtnDK_SuccessfulRegistration() throws SQLException {
        // Thiết lập hành vi của các thành phần GUI trong view
        JTextField mockTxtTaiKhoan = Mockito.mock(JTextField.class);
        JPasswordField mockTxtMK = Mockito.mock(JPasswordField.class);
        JComboBox<String> mockCboHoi = Mockito.mock(JComboBox.class);
        JTextField mockTxtTraLoi = Mockito.mock(JTextField.class);
        JButton mockBtnTaoTK = Mockito.mock(JButton.class);
        JButton mockBtnThoat = Mockito.mock(JButton.class);

        when(mockView.getTxtTaiKhoan()).thenReturn(mockTxtTaiKhoan);
        when(mockView.getTxtMK()).thenReturn(mockTxtMK);
        when(mockView.getCboHoi()).thenReturn(mockCboHoi);
        when(mockView.getTxtTraLoi()).thenReturn(mockTxtTraLoi);
        when(mockView.getBtnTaoTK()).thenReturn(mockBtnTaoTK);
        when(mockView.getBtnThoat()).thenReturn(mockBtnThoat);

        when(mockTxtTaiKhoan.getText()).thenReturn("testUser");
        when(mockTxtMK.getText()).thenReturn("password");
        when(mockCboHoi.getSelectedItem()).thenReturn("Question");
        when(mockTxtTraLoi.getText()).thenReturn("Answer");

        // Giả lập hành vi của checkNull
        when(mockView.checkNull()).thenReturn(false);

        // Giả lập hành vi của executeUpdate
        when(mockPreparedStatement.executeUpdate()).thenReturn(1);

        // Gọi phương thức btnDK
//        dangKiController.btnDK();

        // Kiểm tra xem prepared statement đã được thiết lập đúng chưa
        verify(mockPreparedStatement).setString(1, "testUser");
        verify(mockPreparedStatement).setString(2, "password");
        verify(mockPreparedStatement).setString(3, "Question");
        verify(mockPreparedStatement).setString(4, "Answer");

        // Kiểm tra xem phương thức executeUpdate đã được gọi chưa
        verify(mockPreparedStatement).executeUpdate();

        // Kiểm tra xem thông báo đăng ký thành công đã được hiển thị chưa
        verify(mockView).show(Boolean.parseBoolean("Đăng kí thành công!"));
    }

    @Test
    public void testBtnDK_ExistingUser() throws SQLException {}
        // Thiết lập hành vi
}