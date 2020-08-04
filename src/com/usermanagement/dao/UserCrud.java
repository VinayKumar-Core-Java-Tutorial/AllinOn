package com.usermanagement.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.usermanagement.DBconnect.UserConnect;
import com.usermanagement.model.UserParam;

public class UserCrud {

	public static int save(UserParam e){  
        int status=0;  
        try{  
            Connection con=UserConnect.getConnection(); 
            
            PreparedStatement ps=con.prepareStatement(  
                         "insert into users(uname,upwd,uemail,fcheck,fname,fpwd,gcheck,gname,gpwd) values (?,?,?,?,?,?,?,?,?)");  
            ps.setString(1,e.getUname());  
            ps.setString(2,e.getUpwd()); 
            ps.setString(3,e.getUemail()); 
            ps.setString(4,e.getFcheck());
            ps.setString(5, e.getFname());
            ps.setString(6, e.getFpwd());
            ps.setString(7, e.getGcheck());
            ps.setString(8,e.getGname());
            ps.setString(9, e.getGpwd());
                          
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return status;  
    } 
	
	
	public static UserParam getUserById(int id){  
		UserParam e=new UserParam();  
          
        try{  
            Connection con=UserConnect.getConnection();  
            PreparedStatement ps=con.prepareStatement("select * from Users where id=?");  
            ps.setInt(1,id);  
           
            ResultSet rs=ps.executeQuery();  
            if(rs.next()){  
                e.setId(rs.getInt("id")); 
                e.setUname(rs.getString("uname"));  
                e.setUpwd(rs.getString("upwd")); 
                e.setUemail(rs.getString("uemail"));
                e.setFcheck(rs.getString("fcheck"));
                e.setFname(rs.getString("fname")); 
                e.setFpwd(rs.getString("fpwd"));  
                e.setGcheck(rs.getString("gcheck"));
                e.setGname(rs.getString("gname")); 
                e.setGpwd(rs.getString("gpwd"));
                 
            }  
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
            
        return e;  
    }  
	
	 public static int update(UserParam e){  
	        int status=0;  
	        try{  
	            Connection con=UserConnect.getConnection();  
	            PreparedStatement ps=con.prepareStatement(  
	                         "update Users set uname=?,upwd=?,uemail=? where id=?"); 
	            ps.setString(1,e.getUname());  
	            ps.setString(2,e.getUpwd()); 
	            ps.setString(3,e.getUemail());  
	            ps.setInt(4,e.getId());  
	              
	            status=ps.executeUpdate();  
	              
	            con.close();  
	        }catch(Exception ex){ex.printStackTrace();}  
	          
	        return status;  
	    }  
	 public static int delete(int id){  
	        int status=0;  
	        try{  
	            Connection con=UserConnect.getConnection();  
	            PreparedStatement ps=con.prepareStatement("delete from Users where id=?");  
	            ps.setInt(1,id);  
	            status=ps.executeUpdate();  
	              
	            con.close();  
	        }catch(Exception e){e.printStackTrace();}  
	          
	        return status;  
	    }  
	 
	public static int addLinkValues(UserParam e){  
        int status=0;  
        try{  
            Connection con=UserConnect.getConnection();  
            PreparedStatement ps=con.prepareStatement("Update Users set fcheck=?, fname=?, fpwd=?, gcheck=?, gname=?, gpwd=? where id=?");   
            
            ps.setString(1,e.getFcheck());  
            ps.setString(2,e.getFname()); 
            ps.setString(3,e.getFpwd());  
            ps.setString(4,e.getGcheck());  
            ps.setString(5,e.getGname()); 
            ps.setString(6,e.getGpwd());  
            ps.setInt(7,e.getId()); 
            
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return status;  
    } 
	public static int deleteLinkValues(UserParam e){  
        int status=0;  
        try{  
            Connection con=UserConnect.getConnection();  
            PreparedStatement ps=con.prepareStatement("Update Users set fcheck=?, gcheck=? where id=?");   
            
            ps.setString(1,e.getFcheck());  
  
            ps.setString(2,e.getGcheck());  
   
            ps.setInt(3,e.getId()); 
            
            status=ps.executeUpdate();  
              
            con.close();  
        }catch(Exception ex){ex.printStackTrace();}  
          
        return status;  
    } 
    
}
