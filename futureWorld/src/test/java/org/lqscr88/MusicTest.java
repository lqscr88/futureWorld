package org.lqscr88;

import java.io.*;

public class MusicTest {

    public static void main(String[] args) throws IOException {

                //定义输出目录
                String FileOut="C:\\Users\\lqscr88\\Music\\合并\\合并.flac";
                BufferedWriter bw=new BufferedWriter(new FileWriter(FileOut));

                //读取目录下的每个文件或者文件夹，并读取文件的内容写到目标文字中去
                File[] list = new File("C:\\Users\\lqscr88\\Music\\剪切").listFiles();
                int fileCount = 0;
                int folderConut= 0;
                for(File file : list)
                {
                    if(file.isFile())
                    {
                        fileCount++;
                        BufferedReader br = new BufferedReader(new FileReader(file));
                        String line;
                        while((line=br.readLine())!=null) {
                            bw.write(line);
                            bw.newLine();
                        }
                        br.close();
                    }else {
                        folderConut++;
                    }
                }
                bw.close();
                System.out.println("输入目录下文件个数为"+fileCount);
                System.out.println("输入目录下文件夹个数为"+folderConut);

            }

        }