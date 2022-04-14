package Class;

import Dto.BookmarkDto;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Bookmark {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long bookmarkNum;

    @Column(nullable = false) // 카페 외래키
    private Long cafeNum;

    @Column(nullable = false) // 퍼스널 외래키
    private Long memNum;


    public Bookmark(BookmarkDto bookmarkDto) {
        this.bookmarkNum = bookmarkDto.getBookmarkNum();
        this.cafeNum = bookmarkDto.getCafeNum();
        this.memNum = bookmarkDto.getMemNum();

    }

    public void update(BookmarkDto bookmarkDto) {
        this.bookmarkNum = bookmarkDto.getBookmarkNum();
        this.cafeNum = bookmarkDto.getCafeNum();
        this.memNum = bookmarkDto.getMemNum();
    }
}