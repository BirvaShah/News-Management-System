package com.fdmgroup.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.fdmgroup.model.NewsReader;

public class DataAccessNewsReaderImpl implements DataAccessNewsReader {

	

	public DataAccessNewsReaderImpl() {

		em = emf.createEntityManager();
	}

	public void remove(NewsReader t) {
		// TODO Auto-generated method stub

	}

	public void removeById(int id) {
		// TODO Auto-generated method stub

	}

	public NewsReader getByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<NewsReader> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public NewsReader getByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	public void createUser(String username, String fname, String lname, String email, String pwd) {
		// TODO Auto-generated method stub
//		NewsReader reader = new NewsReader(username, fname, lname, email, pwd);
//		System.out.println(reader.toString());
//		em.getTransaction().begin();
//		em.persist(reader);
//		em.getTransaction().commit();
	}

	public DataAccessNewsReader persist(NewsReader n1) {
		// TODO Auto-generated method stub
		
		return null;
	}

//	public void persist(NewsReader reader) {
//		em.getTransaction().begin();
//		em.persist(reader);
//		em.getTransaction().commit();
//	}

//	@Override
//	public NewsReader register(String fname, String lname, String email, String pwd) {
	// TODO Auto-generated method stub

//		curReader.setFirstName(fname);
//		curReader.setLastName(lname);
//		curReader.setEmail(email);
//		curReader.setPassword(pwd);
//
//		String string = fname.toLowerCase().substring(0, 1);
//		String username = string + lname.toLowerCase();
//		curReader.setUsername(username);
//
//		try {
//			em.getTransaction().begin();
////			empFound.setName(name);
//			NewsReader reader = em.merge(curReader);
//			em.getTransaction().commit();
//			//return reader;
//		} catch (Exception cve) {
////			System.out.println("You are already registered. Please login instead.");
//		}
//		return curReader;
//
//		return null;
//
//	}

//	public NewsReader updateUserProfile(int option, String currUsername, String input) {
//		try {
//
//			switch (option) {
//			case 1:
//				String query1 = "UPDATE news_reader SET first_name = ? WHERE username=?";
//				PreparedStatement ps1 = conn.prepareStatement(query1);
//				ps1.setString(1, input);
//				ps1.setString(2, currUsername);
//				ps1.executeQuery();
//				curReader.setFirstName(input);
//				break;
//			case 2:
//				String query2 = "UPDATE news_reader SET last_name = ? WHERE username=?";
//				PreparedStatement ps2 = conn.prepareStatement(query2);
//				ps2.setString(1, input);
//				ps2.setString(2, currUsername);
//				ps2.executeQuery();
//				curReader.setLastName(input);
//				break;
//			case 3:
//				String query3 = "UPDATE news_reader SET email = ? WHERE username=?";
//				PreparedStatement ps3 = conn.prepareStatement(query3);
//				ps3.setString(1, input);
//				ps3.setString(2, currUsername);
//				ps3.executeQuery();
//				curReader.setEmail(input);
//				break;
//			case 4:
//				String query4 = "UPDATE news_reader SET pswrd = ? WHERE username=?";
//				PreparedStatement ps4 = conn.prepareStatement(query4);
//				ps4.setString(1, input);
//				ps4.setString(2, currUsername);
//				ps4.executeQuery();
//				curReader.setPassword(input);
//				break;
//			}
//
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return null;
//	}

//	public boolean authenticateCredentials(String username, String password) {

//		String query = "SELECT COUNT(news_reader_id) FROM News_Reader WHERE username=? AND pswrd=?";
//		try {
//			PreparedStatement ps = conn.prepareStatement(query);
//			ps.setString(1, username);
//			ps.setString(2, password);
//			ResultSet rs = ps.executeQuery();
//			rs.next();
//			if (rs.getInt(1) > 0) {
//
//				return true;
//			}
//		} catch (SQLException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}

//		return false;
//	}

//	public NewsReader getByUsername(String username) {
	// TODO Auto-generated method stub

//		String query = "SELECT * FROM News_Reader WHERE username=?";
//		try {
//			PreparedStatement ps = conn.prepareStatement(query);
//			ps.setString(1, username);
//			ResultSet rs = ps.executeQuery();
//			rs.next();
//
//			String firstname = rs.getString("first_name");
//			String lastname = rs.getString("last_name");
//			curReader.setFirstName(firstname);
//			curReader.setLastName(lastname);
//			curReader.setEmail(rs.getString("email"));
//			curReader.setUsername(rs.getString("username"));
//			curReader.setPassword(rs.getString("pswrd"));
//			return curReader;
//
//		} catch (SQLException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//		return null;
//	}

//	public NewsArticle saveArticles() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public NewsArticle readArticles() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public NewsReader getByID(int id) {
//		// TODO Auto-generated method stub
//		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		return null;
//	}
//
//	public List<NewsReader> getAll() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public void remove(NewsReader t) {
//		// TODO Auto-generated method stub
////		removeById(t.getNewsReaderID());
//	}
//
//	public void removeById(int id) {
//		// TODO Auto-generated method stub
////		newsReaders.remove(id);
//	}
//
//	public void removeByUsername(String username) {
//		// TODO Auto-generated method stub
////		for (NewsReader reader : newsReaders) {
////			if (reader.getUsername().equals(username)) {
////				removeById(reader.getNewsReaderID());
////			}
////		}
//	}
//
//	@Override
//	public void merge(EntityManager em, NewsReader curReader) {
//		// TODO Auto-generated method stub
//		em.getTransaction().begin();
//		em.persist(curReader);
//		em.getTransaction().commit();
////		return reader;	
//	}
//
//	@Override
//	public void register(String fname, String lname, String username, String email, String pwd) {
//		// TODO Auto-generated method stub
//		NewsReader reader = new NewsReader(username,fname,lname,email,pwd);
//		em.getTransaction().begin();
//		em.persist(reader);
//		em.getTransaction().commit();
//		System.out.println("reader registered");
//	}

}
