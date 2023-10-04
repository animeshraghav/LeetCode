class MyHashMap {
    int[] map;
    Set<Integer> set;
    public MyHashMap() {
        map = new int[1000001];
        set = new HashSet<>();
    }
    public void put(int key, int value) {
        map[key] = value;
        set.add(key);
    }
    public int get(int key) {
        return set.contains(key) ? map[key] : -1;
    }
    public void remove(int key) {
        if (set.contains(key)) {
            set.remove(key);
        }
    }
}