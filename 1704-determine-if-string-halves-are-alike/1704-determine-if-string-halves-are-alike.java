class Solution {
    public boolean halvesAreAlike(String s) {
        int len=s.length();
        int count1=0;
        int count2=0;
        for(int i=0;i<len/2;i++){
            char c1=s.charAt(i);
            char c2=s.charAt(len/2 +i);
            if(c1=='a'|| c1=='e'|| c1=='i'|| c1=='o'|| c1=='u'||c1=='A'|| c1=='E'|| c1=='I'|| c1=='O'|| c1=='U'){
                count1++;
            }
            if(c2=='a'|| c2=='e'|| c2=='i'|| c2=='o'|| c2=='u'||c2=='A'|| c2=='E'|| c2=='I'|| c2=='O'|| c2=='U'){
                count2++;
            }
        }
        return count1==count2;
        // one more clean way
        // String vowels="aeiouAEIOU";
        // can check for :- if(vowels.indexOf(c1) != -1) coutn1++;
        //                  if(vowels.indexOf(c2) != -1) coutn2++;

    }
}