package sort;

import static sort.InsertSortDemo.printArr;

public class BubbleSort {
    public static void main(String[] args) {

        int[] arr = {2, 4, 5, 3, 1};
        bubbleSort(arr);
        printArr(arr);
    }

    /**
     * 冒泡排序：
     * <p>
     * &nbsp;&nbsp;1.相邻的元素两两比较，大的放右边，小的放左边
     * </p>
     * <p>
     * &nbsp;&nbsp;2.第一轮比较完毕之后，最大值就已经确定，第二轮可以少循环一次，后面以此类推
     * </p>
     * <p>
     * &nbsp;&nbsp;3.如果数组中有n个数据，总共我们只要执行n-1轮的代码就可以
     * </p>
     *
     * @param arr 待排序的数组
     */
    public static void bubbleSort(int[] arr) {
        //外循环：表示要执行多少轮。 如果有n个数据，那么执行n - 1 轮
        for (int i = 0; i < arr.length - 1; i++) {
            //内循环：比较数据并找到当前的最大值
            //-1：为了防止索引越界
            //-i：提高效率，每一轮执行的次数应该比上一轮少一次。
            for (int j = 0; j < arr.length - 1 - i; j++) {
                //i 依次表示数组中的每一个索引：0 1 2 3 4
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}