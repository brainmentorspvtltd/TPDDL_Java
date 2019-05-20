import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CommonGenericParamsDAO implements CommonDAO {
		public ArrayList<CommonGenericParamsDTO> getValues(String key) throws ClassNotFoundException, SQLException{
			ArrayList<CommonGenericParamsDTO> list = new ArrayList<>();
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
			con = CommonDAO.getConnection();
			pstmt = con.prepareStatement(SQL);
			pstmt.setString(1, key);
			rs= pstmt.executeQuery();
			System.out.println("Query Fire.... For "+key);
			while(rs.next()) {
				String gKey = rs.getString("gkey");
				String gValue = rs.getString("gval");
				String desc = rs.getString("descr");
				CommonGenericParamsDTO dto = new CommonGenericParamsDTO();
				dto.setKey(gKey);
				dto.setValue(gValue);
				dto.setDescr(desc);
				list.add(dto);
			}
			}
			finally {
				if(rs!=null) {
					rs.close();
				}
				if(pstmt!=null) {
					pstmt.close();
				}
				if(con!=null) {
					con.close();
				}
			}
			return list;
		}
}
