public class ThanosSort {
    public static void main(String[] args) {
        int test[] = {-5, 5, -16, 16, -99, 99, -155, 155, -2, 2, -56, 56, -222, 222};
        test = thanos_sort(test);
        for(int i = 0; i < test.length; i++)
            System.out.println(test[i]);
    }
    public static int[] thanos_sort(int[] array) {
        if (array == null)
            return (null);
        float sum = 0;
        int length = array.length;
        int left_side = 0;
        int right_side = length - 1;
        int new_arr[] = new int[length];
        for (int i = 0; i < length; i++)
            sum += array[i];
        sum = sum / length;
        for(int i = 0; i < length; i++)
        {
            if (array[i] <= sum)
                new_arr[left_side++] = array[i];
            else
                new_arr[right_side--] = array[i];
        }
        if (left_side != length)
        {
            int k = 0;
            int recursive_arr1[] = new int[left_side];
            int recursive_arr2[] = new int[length - left_side];
            for (int i = 0; i < length; i++)
            {
                if (i < left_side)
                    recursive_arr1[i] = new_arr[i];
                else
                    recursive_arr2[k++] = new_arr[i];
            }
            recursive_arr1 = thanos_sort(recursive_arr1);
            recursive_arr2 = thanos_sort(recursive_arr2);
            k = 0;
            for (int i = 0; i < length; i++)
            {
                if (i < left_side)
                    new_arr[i] = recursive_arr1[i];
                else
                    new_arr[i] = recursive_arr2[k++];
            }
        }
        return (new_arr);
    }
}
