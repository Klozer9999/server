package Service;

import Dto.BookmarkDto;
import Repository.BookmarkRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import Class.Bookmark;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class BookmarkService {

    private final BookmarkRepository bookmarkRepository;

    @Transactional
    public Long update(Long bookmarkNum, BookmarkDto bookmarkDto) {
        Bookmark bookmark = bookmarkRepository.findById(bookmarkNum).orElseThrow(
                () -> new IllegalArgumentException("해당 멤버 번호가 존재하지 않습니다.")
        );
        bookmark.update(bookmarkDto);
        return bookmark.getBookmarkNum();
    }
}