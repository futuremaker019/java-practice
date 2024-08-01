package day10;

import java.util.*;
import java.util.stream.IntStream;

public class KthLargest {

    private final int k;
    private int[] nums;
    private final Map<Integer, Integer> map;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.nums = nums;
        this.map = new HashMap<>();
    }

    public int add(int val) {
        int[] ints = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            ints[i] = this.nums[i];
        }
        ints[ints.length - 1] = val;
        Arrays.sort(ints);

        this.nums = Arrays.copyOf(ints, ints.length);
        return this.nums[this.nums.length - this.k];
    }

    public int add2(int val) {
        ArrayList<Integer> list = new ArrayList<>(this.map.values());
        list.add(val);
        Collections.sort(list);
        System.out.println("list = " + list);

        if (this.map.keySet().isEmpty()) {
            IntStream.range(0, list.size()).forEach(i -> this.map.put(i, list.get(i)));
        }

        // 플이가 아직 안됨

        return this.map.get(this.map.size() - this.k);
    }

    /**
     * 우선순위 큐를 활용한 Heap 자료구조 형태도 테스트해야 한다.
     */

}
