class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(char c: s.toCharArray()){
            if(map.containsKey(c)){
                map.put(c, map.get(c) + 1);
            }
            else {
                map.put(c, 1);
            }
        }
        int index = 0;
        String res = "";
        int max = Integer.MIN_VALUE;
        char j = '!';
        char[] c = s.toCharArray();
        while(index < s.length()){
            for(int i = 0; i < c.length; i++){
                if(map.get(c[i]) > max){
                    max = map.get(c[i]);
                    j = c[i];
                }
            }
            while(max > 0){
                res += j;
                max--;
            }
            map.put(j, 0);
            index++;
        }
        return res;
    }
}
//Using Max Heap:

class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(char c: s.toCharArray()){
            if(map.containsKey(c)){
                map.put(c, map.get(c) + 1);
            }
            else {
                map.put(c, 1);
            }
        }

        StringBuilder res = new StringBuilder();
        PriorityQueue<Character> heap = new PriorityQueue<Character>((a, b) -> map.get(b) - map.get(a));
        heap.addAll(map.keySet());
        while(!heap.isEmpty()){
            char temp = heap.remove();
            for(int i = 0; i < map.get(temp); i++){
                res.append(temp);
            }            
        }
        
        
        return res.toString();
    }
}
