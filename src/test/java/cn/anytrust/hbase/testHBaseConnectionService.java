package cn.anytrust.hbase;

import java.util.List;

import org.apache.hadoop.hbase.util.Bytes;

import cn.anytrust.hbase.service.HBaseConnectionService;
import cn.anytrust.hbase.service.impl.HBaseConnectionServiceImpl;

public class testHBaseConnectionService {
	static HBaseConnectionService hBaseConnectionService = new HBaseConnectionServiceImpl();
	static Apple apple = new Apple();
	static {
		apple.setId("123");
		apple.setContent("gaoweigong");
		apple.setImgs(Bytes.toBytes("StringTest!"));
	}
	
	public static void testInsert(){
		hBaseConnectionService.insert(apple);
	}
	
	public static void testDelete(){
		hBaseConnectionService.delete("crawldbtest", "123");
	}
	
	public static void testGet(){
		List<Apple> objs = hBaseConnectionService.get(apple, "123");
		for (Apple obj : objs) {
			System.out.println(obj.getContent());
			System.out.println(obj.getId());
		}
	}
	
	
	public static void main(String[] args) {
		testInsert();
		testGet();
		testDelete();
	}
}
