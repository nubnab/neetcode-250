package dev.nabnub.arrays;

import java.util.ArrayList;
import java.util.List;

public class EncodeDecodeStrings {
        public String encode(List<String> strs) {
            if(strs.isEmpty()) return "";
            StringBuilder sb = new StringBuilder();

            for(String str : strs) {
                sb.append(str.length());
                sb.append("#");
                sb.append(str);
            }

            return sb.toString();
        }

        public List<String> decode(String str) {
            if(str.isEmpty()) return new ArrayList<>();

            List<String> res = new ArrayList<>();

            while(!str.isEmpty()) {
                int separator = str.indexOf("#") + 1;
                int wordLength = Integer.parseInt(str.substring(0, separator - 1));

                String word = str.substring(separator, separator + wordLength);

                str = str.substring(separator + wordLength);

                res.add(word);
            }

            return res;
        }

}
