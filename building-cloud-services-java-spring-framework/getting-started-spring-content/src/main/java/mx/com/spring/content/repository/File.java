package mx.com.spring.content.repository;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.content.commons.annotations.ContentId;
import org.springframework.content.commons.annotations.ContentLength;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
public class File {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;
	private Date created = new Date();
	private String summary;
	
	@ContentId private String contentId;
	@ContentLength private long contentLength;
	private String mimeType = "text/plain";
	
}
