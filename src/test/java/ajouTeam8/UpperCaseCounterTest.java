package ajouTeam8;

import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.*;

public class UpperCaseCounterTest {


    private UpperCaseCounter upperCaseCounter = new UpperCaseCounter();

    //null을 전달했을 때 0을 리턴하는지에 대한 테스트 작성
    @Test
    public void getNumberOfUpperCaseCharactersInString_return_0_for_null_input(){
        String str = null;

        int numberOfUpperCaseCharactersInString = upperCaseCounter.getNumberOfUpperCaseCharactersInString(str);
        System.out.println("result:: " + numberOfUpperCaseCharactersInString);
        assertTrue(numberOfUpperCaseCharactersInString == 0);
    }

    //빈값을 전달했을 때 0을 리턴하는지에 대한 테스트 작성
    @Test
    public void getNumberOfUpperCaseCharactersInString_return_0_for_empty_input() {
        String str = "";
        int numberOfUpperCaseCharactersInString = upperCaseCounter.getNumberOfUpperCaseCharactersInString(str);
        assertTrue(numberOfUpperCaseCharactersInString == 0);
    }

    //대문자들이 포함된 문자열을 전달했을 때 카운팅된 숫자와 맞는지 검증하는 테스트 작성
    @Test
    public void getNumberOfUpperCaseCharactersInString_return_10_for_ABCDEFGHIJ() {
        String str = "ABCDEFGHIJ";

        int numberOfUpperCaseCharactersInString = upperCaseCounter.getNumberOfUpperCaseCharactersInString(str);

        //assertTrue로 맞는 테스트 코드 작성
        assertTrue(numberOfUpperCaseCharactersInString == 10);
        //assertFalse로 틀리는 값을 넣어 테스트 작성
        assertFalse(numberOfUpperCaseCharactersInString != 10);
        //assertThat 단정문을 사용해서 True인 테스트 코드 작성
        assertThat(numberOfUpperCaseCharactersInString, is(10));
    }

    //대소문자가 섞여 있을 때 정확히 카운팅 되는 지에 대한 테스트 코드 작성
    @Test
    public void getNumberOfUpperCaseCharacterInString_return_6_for_ABCdefGHI(){
        String str = "ABCdefGHI";
        int result = upperCaseCounter.getNumberOfUpperCaseCharactersInString(str);
        //assertTrue로 맞는 테스트 코드 작성
        assertTrue(result == 6);
        //assertFalse로 틀리는 값을 넣어 테스트 작성
        assertFalse(result != 6);
        //assertThat 단정문을 사용해서 True인 테스트 코드 작성
        assertThat(result, is(6));
        System.out.println("result :: " + result);
    }

    //잘못된 값을 참조했을 때 IndexOutOfBoundsException Exception이 발생하는지 테스트 코드 작성
    @Test(expected = IndexOutOfBoundsException.class)
    public void shouldThrowExceptionWhenGetZeroIndex() {
        new ArrayList<Object>().get(0);

    }

    //해당 메소드가 제한된 시간내에 실행되는지에 대한 테스트 코드 작성 : timeout 사용
    //두번째로 해당 메소드는 테스트 하지 않도록 어노테이션 추가 적용 해봅니다. Ignore
    @Test(timeout = 4000)
    public void testShouldRunInLimitedTime() throws InterruptedException {
        Thread.sleep(4000);
        System.out.println("제한된 시간 내에 수행되면 테스트 Passed!");
    }

//송치완
    @Test
    public void GreaterThanOrEqualTo(){
        String fruitName1 = "APPLE";
        String fruitName2 = "PineaPple";
        int result1 =upperCaseCounter.getNumberOfUpperCaseCharactersInString(fruitName1);
        int result2 =upperCaseCounter.getNumberOfUpperCaseCharactersInString(fruitName2);

        //GreaterThanOrEqualTo
        //result1하고 5이상인것을 비교
        assertThat(result1, greaterThanOrEqualTo(5));
        //result1하고 4이상인것을 비교
        assertThat(result1,greaterThanOrEqualTo(4));

        //lessThanOrEuqalTo
        //result2하고 2이하인것을 비교
        assertThat(result2, lessThanOrEqualTo(2));
        //result1하고 result2ㅂ교
        assertThat(result2,lessThanOrEqualTo(result1));


    }


//송치완
    @Test
    public void LessthanOrEqualTo(){
        String fruitName1 = "APPLE";
        String fruitName2 = "PineaPple";
        int result1 =upperCaseCounter.getNumberOfUpperCaseCharactersInString(fruitName1);
        int result2 =upperCaseCounter.getNumberOfUpperCaseCharactersInString(fruitName2);

        //lessThanOrEuqalTo
        //result2하고 2이하인것을 비교
        assertThat(result2, lessThanOrEqualTo(2));
        //result1하고 result2비교
        assertThat(result2,lessThanOrEqualTo(result1));


    }

    //홍지호
    @Test
    public void getNumberOfUpperCaseCharacterInString_equalTo_test(){
        String str ="ABCDefGH";
        int result =upperCaseCounter.getNumberOfUpperCaseCharactersInString(str);

        assertThat(result, is(equalTo(6)));
    }

    //홍지호
    @Test
    public void getNumberOfUpperCaseCharacterInString_greaterThan_test(){
        String str1 = "ABCded";
        String str2 = "MoBeaHongSong";
        int result1 =upperCaseCounter.getNumberOfUpperCaseCharactersInString(str1);
        int result2 =upperCaseCounter.getNumberOfUpperCaseCharactersInString(str2);

        assertThat(result2,greaterThan(result1));
        System.out.println("result2:"+result2+" greaterThan result1:"+result1);
    }

    //홍지호
    @Test
    public void getNumberOfUpperCaseCharacterInString_lessthan_test(){
        String str = "ABCded";
        int result =upperCaseCounter.getNumberOfUpperCaseCharactersInString(str);

        assertThat(result, lessThan(5));
        System.out.println("result1:"+result+"lessThan 5");

    }


}

