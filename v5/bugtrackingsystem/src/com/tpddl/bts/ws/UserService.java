package com.tpddl.bts.ws;

import java.sql.SQLException;
import java.util.Random;

import javax.naming.NamingException;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.tpddl.bts.users.dao.UserDAO;
import com.tpddl.bts.users.dto.UserDTO;
import com.tpddl.bts.users.dto.UserVO;
@Path("/user")
public class UserService {
	
	@Path("/login2")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	//@Path("/login/{userid}/{password}")
	public UserVO doLogin2(UserDTO userDTOObject) {
		UserVO userVO = new UserVO();
		UserDAO userDAO = new UserDAO();
		UserDTO userDTO = new UserDTO();
//		userDTO.setUserid(userDTOObject.getUserid());
//		userDTO.setPassword(pwd);
		try {
			UserDTO userObject = userDAO.login(userDTOObject);
			userVO.setUserid(userObject.getUserid());
			userVO.setPhone(userObject.getPhone());
			Random r = new Random();
			int tokenId =  r.nextInt((1000 - 100) + 1) + 100;
			userVO.setTokenId(tokenId);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		userVO.setUserid("AMIT");
//		userVO.setPhone("2222");
		return userVO;
	}
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/login/{userid}/{password}")
	public UserVO doLogin(@PathParam("userid") String uid, @PathParam("password") String pwd) {
		UserVO userVO = new UserVO();
		UserDAO userDAO = new UserDAO();
		UserDTO userDTO = new UserDTO();
		userDTO.setUserid(uid);
		userDTO.setPassword(pwd);
		try {
			UserDTO userObject = userDAO.login(userDTO);
			userVO.setUserid(userObject.getUserid());
			userVO.setPhone(userObject.getPhone());
			Random r = new Random();
			int tokenId =  r.nextInt((1000 - 100) + 1) + 100;
			userVO.setTokenId(tokenId);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		userVO.setUserid("AMIT");
//		userVO.setPhone("2222");
		return userVO;
	}
	

}
