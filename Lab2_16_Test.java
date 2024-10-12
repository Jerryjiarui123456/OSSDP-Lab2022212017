
public class Lab2_16_Test {
    // 测试类命名规则：L学号_X_Test.java，其中X为所分配题号

    // 使用单元测试技术

    // 测试类最开始要给出测试用例设计的总体原则，如等价类划分原则等
    // 等价类划分原则：将输入数据划分为若干个等价类，每个等价类中的任意值对于被测试的程序来说都是等价的。
    // 例如，对于整数除法函数，我们可以将输入划分为正数、负数、零和非数字等等价类。

    @Test
    public void testAddPositiveNumbers() {
        // 测试目的：验证两个正数相加的结果是否正确
        // 测试用例：(2, 3) -> 5
        assertEquals(5, add(2, 3));
    }

    @Test
    public void testAddNegativeNumbers() {
        // 测试目的：验证两个负数相加的结果是否正确
        // 测试用例：(-2, -3) -> -5
        assertEquals(-5, add(-2, -3));
    }

    @Test
    public void testAddZero() {
        // 测试目的：验证0与其他数相加的结果是否正确
        // 测试用例：(0, 3) -> 3, (3, 0) -> 3, (0, 0) -> 0
        assertEquals(3, add(0, 3));
        assertEquals(3, add(3, 0));
        assertEquals(0, add(0, 0));
    }

    // 其他测试方法...

    // 被测试的方法（示例）
    public int add(int a, int b) {
        return a + b;
    }

    @Test
    public void testLargestNumber() {
        Solution solution = new Solution();
        assertEquals("534", solution.largestNumber(new int[]{50, 34, 9, 5}));
        assertEquals("0", solution.largestNumber(new int[]{0, 0}));
        assertEquals("210", solution.largestNumber(new int[]{10, 2}));
    }
}
