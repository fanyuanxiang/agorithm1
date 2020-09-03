package com.cx.day15;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.channels.FileChannel;

public class TestChannel {
    //nio使用   每次读取一个buffer到缓冲区
    public static void main(String[] args) throws IOException {
        FileInputStream is =new FileInputStream("a.txt");
        FileChannel fc=is.getChannel();
        ByteBuffer bb=ByteBuffer.allocate(1024);//分配一个1M的缓冲Buffer
        //read data to buffer
        fc.read(bb);
        bb.flip();//从读数据，切换到写数据
        /*
        在读模式下，可以读取之前写入到buffer的所有数 据。
        一旦读完了所有的数据，就需要清空缓冲区，让它可以再次 被写入。有两种方式能清空缓冲区:
        调用clear()或 compact()方法。clear()方法会清空整个缓冲区。
        compact()方法只会清除已经读过的数据。任何未读的数据 都被移到缓冲区的起始处，新写入的数据将放到缓冲区未读 数据的后面。
         */

        while (bb.remaining()>0){//如果buffer中还有数据未写
            byte b=bb.get();//从buffer中获取数据
            System.out.println((char)b);
        }
        is.close();



    }
}
