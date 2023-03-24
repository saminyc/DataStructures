import java.io.*;

import static java.util.stream.Collectors.joining;

class timeConversion {

        /*
         * The function is expected to return a STRING.
         * The function accepts STRING s as parameter.
         */

        public static String timeConverts(String s) {
        
                //A single string  that represents a time in -hour clock format (i.e.: hh:mm:ssAM

                //finding hour
                String Str_hour=s.substring(0,2);
                int hour = Integer.parseInt(Str_hour);//Converts the hour to integers values

                //convert pm to lowercase
                String converted=null;
                
                //PM cases

                if(s.toLowerCase().contains("pm")){//if it does contain pm then convert to 24 hours
                        if(hour==12){//check if the number is 12pm as it is also 12 in 24hours
                                converted = Integer.toString(hour) +s.substring(2,8);
                        }
                        else if(hour>=1 && hour<12) {//if the hour is in between 1pm & 11:59PM
                                hour += 12;
                                converted = Integer.toString(hour) + s.substring(2, 8);
                        }
                }

                //AM cases
                String zero="0";//zero preceding the single digits
                if(s.toLowerCase().contains("am")){//if it contains AM
                        if(hour==12){//if 12am then make hh as 00 then join it to String
                                converted=Integer.toString(0)+Integer.toString(0)+s.substring(2,8);
                        }
                        else if(hour>=10 && hour <=11){// 10 and 11 AM are double digits

                                converted = Integer.toString(hour) + s.substring(2, 8);
                        }
                        else if(hour>=1 && hour<=9){//concatenate the zero variable to single AM digits
                                converted= zero+Integer.toString(hour)+s.substring(2,8);
                        }
                }

                return converted;




        }

}

public class Solution {
        public static void main(String[] args) throws IOException {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

                String s = bufferedReader.readLine();

                String result = timeConversion.timeConverts(s);

                bufferedWriter.write(result);
                bufferedWriter.newLine();

                bufferedReader.close();
                bufferedWriter.close();
        }
}
