package ladder;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import ladder.domain.LineNumber;
import ladder.domain.Prize;
import ladder.domain.Prizes;

public class PrizesTest {
    @Test
    void 생성_테스트() {
        // given
        String test = "꽝,500, 꽝, 3000";
        Prizes prizes = new Prizes(test, 4);
        // when & then
        assertThat(prizes.getPrizes().size()).isEqualTo(4);
    }

    @Test
    void 상품수_플레이어수_비교_테스트() {
        // given
        String test = "꽝,500, 꽝, 3000";
        // when & then
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Prizes(test, 3));
    }

    @Test
    void 결과_매칭_테스트() {
        // given
        String test = "꽝,500, 꽝, 3000";
        Prizes prizes = new Prizes(test, 4);
        // when & then
        assertThat(prizes.matchNumber(LineNumber.valueOf(1))).isEqualTo(new Prize(1, "500"));
    }

    @Test
    void 존재하지않는_상품_테스트() {
        // given
        String test = "꽝,500, 꽝, 3000";
        Prizes prizes = new Prizes(test, 4);
        // when & then
        Assertions.assertThrows(IllegalArgumentException.class, () -> prizes.matchNumber(LineNumber.valueOf(5)));
    }
}
