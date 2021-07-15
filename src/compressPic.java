///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//
///**
// *
// * @author moham
// */
//
//import java.io.File;
//import java.io.IOException;
// 
//import net.coobird.thumbnailator.Thumbnails;
// 
//public class compressPic {
// 
//	public static void main(String[] args) throws IOException {
//		// default size
//		 //	compress();
//
//		//compress with resize
//		//	compresswithResize();
//
//
//		// compress folder
//		 compressFolder();
//
//		//compress with resize Folder
//		// 	compressFolderWithResize();
//	}
//
//	private static void compress() throws IOException {
//
//		Thumbnails.of("C:\\Users\\mosama\\Desktop\\New folder\\110.jpg")
//		// Do not change the picture size
//		.scale(1f)
//		.toFile("C:\\Users\\mosama\\Desktop\\New folder\\compressOriginal.jpg");
//	}
//	private static void compressFolder() throws IOException {
//
//		File folder = new File("c:\\Users\\moham\\OneDrive\\Desktop\\New folder\\");
//		File[] listOfFiles = folder.listFiles();
//
//		for (File file : listOfFiles) {
//			if (file.isFile()) {
//				Thumbnails.of("c:\\Users\\moham\\OneDrive\\Desktop\\New folder\\"+file.getName())
//						// Do not change the picture size
//						.scale(1f)
//						.toFile("c:\\Users\\moham\\OneDrive\\Desktop\\New\\"+file.getName());
//			}
//		}
//
//	}
//
////	private static void compressFolderWithResize() throws IOException {
////
////		File folder = new File("D:\\Osama\\shofha files\\poster\\");
////		File[] listOfFiles = folder.listFiles();
////
////		for (File file : listOfFiles)
////			if (file.isFile()) {
////				Thumbnails.of("D:\\Osama\\shofha files\\poster\\"+file.getName())
////						// Do not change the picture size
////						.size(200,400)
////						.outputQuality(.5)
////						.toFile("D:\\Osama\\shofha files\\outputQuality 02 & resize java\\"+file.getName());
////			}
////		}
////
////		private static void compresswithResize() throws IOException {
////		Thumbnails.of("C:\\Users\\mosama\\Desktop\\New folder\\110.jpg")
////				// Do not change the picture size
////				.size(200,400)
////				.toFile("C:\\Users\\mosama\\Desktop\\New folder\\compressResize.jpg");
////	}
//
//
//}