package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import beans.Tweet;

public class TweetDAO extends DAO {

	//ツイート一覧を取得するメソッド
	public List<Tweet> getAllTweets() throws Exception {
		List<Tweet> tweets = new ArrayList<>();
		Connection con = getConnection();
		String sql = "SELECT id, content, posted_at, author FROM tweets ORDER BY posted_at DESC";
		PreparedStatement st = con.prepareStatement(sql);
		ResultSet rs = st.executeQuery();
		while (rs.next()) {
			int id = rs.getInt("id");
			String content = rs.getString("content");
			String postedAt = rs.getString("posted_at");
			String author = rs.getString("author");
			Tweet tweet = new Tweet(id, content, postedAt, author);
			tweets.add(tweet);
		}

		st.close();
		con.close();
		return tweets;
	}

	//ツイートを新規投稿するメソッド
	public void addTweet(String content, String author) throws Exception {
		Connection con = getConnection();
		String sql = "INSERT INTO tweets (content, author) VALUES (?, ?)";
		PreparedStatement st = con.prepareStatement(sql);
		st.setString(1, content);
		st.setString(2, author);
		st.executeUpdate();

		st.close();
		con.close();

	}

}
