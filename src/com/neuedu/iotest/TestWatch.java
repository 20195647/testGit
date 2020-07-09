package com.neuedu.iotest;

import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;

public class TestWatch {
	public static void main(String[] args) {
		/*监控目标路径 */
		Path path = Paths.get("C:/");
		try {
			/* 创建文件监控对象 */
			WatchService watchService = FileSystems.getDefault().newWatchService();
			/* 注册文件监控的所有事件类�? */
			path.register(watchService, StandardWatchEventKinds.ENTRY_CREATE,
					StandardWatchEventKinds.ENTRY_DELETE,
					StandardWatchEventKinds.ENTRY_MODIFY);
			/* 循环监测文件 */
			while (true) {
				WatchKey watchKey = watchService.take();
				/* 迭代触发事件的所有文�? */
				for (WatchEvent<?> event : watchKey.pollEvents())
					System.out.println(event.context().toString() + " 事件类型�?"
							+ event.kind());
				if (!watchKey.reset())
					return;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
