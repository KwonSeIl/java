package com.sist.movie;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
// ������̼� => ������
public class MusicVO {
	@Getter
	@Setter
	private int mno;
	private String title;
	private String singer;
	private String album;
	private String state;
	private int crement;

}
