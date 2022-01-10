package kr.green.xml;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
public class Item {
	private String addr1;
	private String addr2;
}
