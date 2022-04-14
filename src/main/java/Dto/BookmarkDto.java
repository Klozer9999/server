package Dto;

import lombok.Getter;

import javax.persistence.Column;

@Getter
public class BookmarkDto {
    private Long bookmarkNum;
    private Long cafeNum;
    private Long memNum;
}