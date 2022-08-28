package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * packageName    : hello.springmvc.basic
 * fileName       : LogTestController
 * author         : kanghyun Kim
 * date           : 2022/08/28
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022/08/28        kanghyun Kim      최초 생성
 */

@Slf4j
@RestController
public class LogTestController {
//    private final Logger log = LoggerFactory.getLogger(LogTestController.class);

    @GetMapping("/log-test")
    public String logTest() {
        String name = "Spring";

        log.info(" info log="+name); // 이렇게 쓰면 안됨 연산과 메모리 사용함
        log.info(" info log={}",name);

        log.trace(" trace log={}",name);

        log.debug(" debug log={}",name);

        log.warn(" warn log={}",name);

        log.error(" error log={}",name);

        return "ok";
    }
}
