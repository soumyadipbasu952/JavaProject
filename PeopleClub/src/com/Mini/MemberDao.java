package com.Mini;



import java.sql.*;
import java.util.ArrayList;

import com.Mini.Member;
import com.Mini.Results;


public class MemberDao 
{
	DatabaseConnector db=new DatabaseConnector();
	
	
	

	public String addMember(Member m)
	{
		String result="";
		
		try
		{
			String query="Insert into peopleclub values (?,?,?,?,?)";
			
			PreparedStatement pstmt=db.getPreparedStatement(query);
			pstmt.setInt(1,m.getId());
			pstmt.setString(2, m.getFname());
			pstmt.setString(3,m.getLname());
			pstmt.setString(4,m.getDob());
			pstmt.setString(5,m.getCity());
			
			
			int i=pstmt.executeUpdate();
			
			if(i==1)
			{
				result=Results.SUCCESS;
			}
			else
			{
				result=Results.FAILURE;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			result=Results.PROBLEM;
		}
		finally
		{
			db.closeConnection();
		}
		
		return result;
	}
	
	
	
	public String deleteMember(Member m)
	{
		String result="";
		
		try
		{
			String query="delete from peopleclub where id=?";;
			PreparedStatement pstmt=db.getPreparedStatement(query);
			pstmt.setInt(1,m.getId());
			
			int i=pstmt.executeUpdate();
			
			if(i==1)
			{
				result=Results.SUCCESS;
			}
			else
			{
				result=Results.FAILURE;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			result=Results.PROBLEM;
		}
		finally
		{
			db.closeConnection();
		}
		
		return result;
	}
	
	
	public ArrayList<Member> getAllMembers()
	{
		ArrayList<Member> list=new ArrayList<>();
		
		
		try
		{
			String query="Select * from peopleclub";
			ResultSet rs=db.getResultSet(query);
			while(rs.next())
			{
				Member m=new Member();
				m.setId(rs.getInt("id"));
				m.setFname(rs.getString("fname"));
				m.setLname(rs.getString("lname"));
				m.setDob(rs.getString("dob"));
				m.setCity(rs.getString("city"));
				
				list.add(m);
			}
			
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		
		}
		finally
		{
			db.closeConnection();
		}
		
		return  list;
	}
	public String deleteUser(Member m)
	{
		String result="";
		
		try
		{
			String query="delete from peopleclub where id=?";;
			PreparedStatement pstmt=db.getPreparedStatement(query);
			pstmt.setInt(1,m.getId());
			
			int i=pstmt.executeUpdate();
			
			if(i==1)
			{
				result=Results.SUCCESS;
			}
			else
			{
				result=Results.FAILURE;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
			result=Results.PROBLEM;
		}
		finally
		{
			db.closeConnection();
		}
		
		return result;
	}
	
	




}
