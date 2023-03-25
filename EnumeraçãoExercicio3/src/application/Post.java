package application;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import antitites.Coment;

public class Post {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment;
	private String title;
	private String content;
	private Integer like;
	
	List<Coment> coments = new ArrayList<Coment>();
	
	public Post() {}

	public Post(Date moment, String title, String content, Integer like) {
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.like = like;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getLike() {
		return like;
	}

	public void setLike(Integer like) {
		this.like = like;
	}

	public List<Coment> getComents() {
		return coments;
	}

	//No luhar de setComents usar add e remove
	public void addComent(Coment coment) {
		coments.add(coment);
	}
	public void removeComent(Coment coment) {
		coments.remove(coment);
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(title + "\n");
		sb.append(like);
		sb.append(" Likes - ");
		sb.append(sdf.format(moment) + "\n");
		sb.append(content + "\n");
		sb.append("Coments: "+ "\n");
		//pega todos os comentarios dentro da lista coments
		for (Coment c : coments) {
			sb.append(c.getText() + "\n");
		}
		//converte o StringBuilder para toString
		return sb.toString();
		
	}
	
	
	

}
