package Controller;

import Class.*;
import Dto.*;
import Repository.*;
import Service.*;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class TotalRestController {

    private final CafeRepository cafeRepository;

    private final CafeService cafeService;

    @GetMapping("/cafe") // create
    public List<Cafe> getCafe() {
        return cafeRepository.findAll();
    }

    @PostMapping("/cafe") // read
    public Cafe createCafe(@RequestBody CafeDto cafeDto) {
        Cafe cafe = new Cafe(cafeDto);
        return cafeRepository.save(cafe);
    }

    @PutMapping("/cafe/{cafeNum}") // update
    public Long updateCafe(@PathVariable Long cafeNum, @RequestBody CafeDto cafeDto) {
        return cafeService.update(cafeNum, cafeDto);
    }

    @DeleteMapping("/cafe/{cafeNum}") // delete
    public Long deleteCafe(@PathVariable Long cafeNum) {
        cafeRepository.deleteById(cafeNum);
        return cafeNum;
    }



    private final BookmarkRepository bookmarkRepository;

    private final BookmarkService bookmarkService;

    @GetMapping("/bookmark") // create
    public List<Bookmark> getBookmark() {
        return bookmarkRepository.findAll();
    }

    @PostMapping("/bookmark") // read
    public Bookmark createBookmark(@RequestBody BookmarkDto bookmarkDto) {
        Bookmark bookmark = new Bookmark(bookmarkDto);
        return bookmarkRepository.save(bookmark);
    }

    @PutMapping("/bookmark/{bookmarkNum}") // update
    public Long updateBookmark(@PathVariable Long bookmarkNum, @RequestBody BookmarkDto bookmarkDto) {
        return bookmarkService.update(bookmarkNum, bookmarkDto);
    }

    @DeleteMapping("/bookmark/{bookmarkNum}") // delete
    public Long deleteBookmark(@PathVariable Long bookmarkNum) {
        bookmarkRepository.deleteById(bookmarkNum);
        return bookmarkNum;
    }



    private final CategoryRepository categoryRepository;

    private final CategoryService categoryService;

    @GetMapping("/category") // create
    public List<category> getCategory() {
        return categoryRepository.findAll();
    }

    @PostMapping("/category") // read
    public Category createCategory(@RequestBody CategoryDto categoryDto) {
        Category category = new Category(categoryDto);
        return categoryRepository.save(category);
    }

    @PutMapping("/category/{categoryNum}") // update
    public Long updateCategory(@PathVariable Long categoryNum, @RequestBody CategoryDto categoryDto) {
        return categoryService.update(categoryNum, categoryDto);
    }

    @DeleteMapping("/category/{categoryNum}") // delete
    public Long deleteCategory(@PathVariable Long categoryNum) {
        categoryRepository.deleteById(categoryNum);
        return categoryNum;
    }



    private final ReviewRepository reviewRepository;

    private final ReviewService reviewService;

    @GetMapping("/review") // create
    public List<review> getReview() {
        return reviewRepository.findAll();
    }

    @PostMapping("/review") // read
    public Review createReview(@RequestBody ReviewDto reviewDto) {
        Review review = new Review(reviewDto);
        return reviewRepository.save(review);
    }

    @PutMapping("/review/{reviewNum}") // update
    public Long updateReview(@PathVariable Long reviewNum, @RequestBody ReviewDto reviewDto) {
        return reviewService.update(reviewNum, reviewDto);
    }

    @DeleteMapping("/review/{reviewNum}") // delete
    public Long deleteReview(@PathVariable Long reviewNum) {
        reviewRepository.deleteById(reviewNum);
        return reviewNum;
    }
}
