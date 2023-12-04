package sec05.chap02.ex02;

/*
* 배열을 생성자 인자로 받아, 그것의 정보를 필드들로 저장
* 복잡한 과정을 거치는 생성자의 예시
*/
public class IntArrayInfo {
    int count;
    int max;
    int min;
    int sum; // 기본 0
    double average;

    IntArrayInfo(int[] nums) {
        count = nums.length;
        max = nums[0];
        min = nums[0];

        for (int num : nums) {
            max = max > num ? max : num;
            min = min < num ? min : num;
            sum += num;
        }
        // 소수부를 잃지 않도록 먼저 1.0을 곱하여 double로 만듦
        average = 1.0 * sum / nums.length;
    }
}
