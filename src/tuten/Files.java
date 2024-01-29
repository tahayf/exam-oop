package tuten;

import java.io.*;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Files {
    public static <T> void writeArrayListToFile(ArrayList<T> list, String fileName) {
        try (FileOutputStream fileOutputStream = new FileOutputStream(fileName);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(list);
            System.out.println("ArrayList written to file: " + fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static <T> ArrayList<T> readArrayListFromFile(String fileName) {
        File file = new File(fileName);
        if (!file.exists()) {
            try {
                file.createNewFile();
                System.out.println("File created: " + fileName);
                return new ArrayList<>();
            } catch (IOException e) {
                e.printStackTrace();
                return null;
            }
        }

        
        try (FileInputStream fileInputStream = new FileInputStream(fileName)) {
        		
        	if(file.length() == 0) {
        		System.out.println(fileName + " is empty.");
        		return new ArrayList<>();
        	}
        	
        	ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            ArrayList<T> list = (ArrayList<T>) objectInputStream.readObject();
            System.out.println("ArrayList read from file: " + fileName);
            return list;
            
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public static void toExcel(Diary diary) {
    	 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH.mm.ss");
         String formattedDate = diary.getWhenStarted().format(formatter);
         String fileName = String.format("%s %s.csv",diary.getWhoSolved(),formattedDate);
         
         try{
             File myFile = new File(fileName);
             FileWriter fw = new FileWriter(myFile);
             PrintWriter pw = new PrintWriter(fw);
             
             for (int i = 0; i < diary.getExam().getN(); i++) {
                 StringBuilder sb = new StringBuilder(); 
                 int num1 = diary.getExam().getQuestions().get(i).getNum1();
                 int num2 = diary.getExam().getQuestions().get(i).getNum2();
                 int answer = diary.getExam().getQuestions().get(i).getAnswer();
                 int result = diary.getExam().getQuestions().get(i).getResult();
                 int time = diary.getExam().getQuestions().get(i).getTimePassed();
                 boolean isTrue = diary.getExam().getQuestions().get(i).isTrue();

                 sb.append(num1).append(" x ").append(num2).append(" = ").append(result).append(" answered as = ").append(answer);
                 
                 if (isTrue) {
                     sb.append(" (True)");
                 } else {
                     sb.append(" (False)");
                 }
                 
                 
                 sb.append(" time passed = ").append(time).append("\n");
                 
                 String last = sb.toString();
                 pw.write(last);
             }   
            
             pw.write("\n");
             pw.write("total time = ");
             pw.write(Integer.toString(diary.getScore().getAllTimePassed()));
             pw.close();
             System.out.println("Csv file created successfully!");
         }catch(IOException e){
             e.printStackTrace();
         }
    }
}