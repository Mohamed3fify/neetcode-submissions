class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Hashtable<Integer, String> myList = new Hashtable<>();
        Hashtable<Integer, String> updatedList = new Hashtable<>();

        List<List<String >> list1 =  new ArrayList<>();

        List<String> list3 =  new ArrayList<>();


        for (int i = 0; i < strs.length; i++){
            myList.put(i,strs[i]);
        }

        for (int i = 0; i < strs.length; i++){

            char[] c = strs[i].toCharArray();
            Arrays.sort(c);
            String sortedChar = Arrays.toString(c);
            updatedList.put(i,sortedChar);
        }

        for (int i = 0 ; i < updatedList.size(); i++){
            List<String> list2 =  new ArrayList<>();
            if (list3.contains(updatedList.get(i))) continue;


            for (int j = i; j < updatedList.size(); j++){

                if (updatedList.get(i).equals(updatedList.get(j))){

                    list2.add(myList.get(j));



                    list3.add(updatedList.get(i));

                }

            } list1.add(list2);

            

        }


        return list1;
    }
}
