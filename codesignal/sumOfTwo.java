boolean sumOfTwo(int[] a, int[] b, int v) {
    Arrays.sort(a);
    Arrays.sort(b);
    for (int i = 0; i < a.length; i++) {
        for (int j = 0; j < b.length; j++) {
            if (v == a[i] + b[j]) {
                return true;
            }
        }
    }
    
    return false;
}
