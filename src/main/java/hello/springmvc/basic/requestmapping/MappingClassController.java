package hello.springmvc.basic.requestmapping;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * packageName    : hello.springmvc.basic.requestmapping
 * fileName       : MappingClassController
 * author         : kanghyun Kim
 * date           : 2022/08/29
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/08/29        kanghyun Kim      최초 생성
 */

@RestController
@RequestMapping("/mapping/users")
public class MappingClassController {

    /**
     * 회원 관리 API
     * 회원 목록 조회: GET /users
     * 회원 등록: POST /users
     * 회원 조회: GET /users/{userId}
     * 회원 수정: PATCH /users/{userId}
     * 회원 전체수정: PUT /users/{userId}/{age}/ ...
     * 회원 삭제: DELETE /users/{userId}
     */
    @GetMapping
    public String user() {
        return "get users";
    }

    @PostMapping
    public String addUser() {
        return "post user";
    }

    @GetMapping("/{userId}")
    public String findUser(@PathVariable String userId) {
        return "get userId= " + userId;
    }

    @PatchMapping("/{userId}")
    public String updateUser(@PathVariable String userId) {
        return "update userId= " + userId;
    }

    @PatchMapping("/{userId}/{age}")
    public String updateUser(@PathVariable String userId, @PathVariable int age) {
        return "update userId= " + userId + ", age= "+age;
    }

    @DeleteMapping("/{userId}")
    public String deleteUser(@PathVariable String userId) {
        return "delete userId= " + userId;
    }
}
