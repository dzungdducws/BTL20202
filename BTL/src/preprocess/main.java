//package preprocess;
//
//import java.io.BufferedWriter;
//import java.io.FileWriter;
//import java.util.Random;
// 
//public class main {
//	public static String taoXau() {
//		StringBuffer Res = new StringBuffer();
//		String Ho[]  = {"Lê ", "Nguyễn ", "Phạm "};
//		String TenDem[] = {"Minh ", "Đức ", "Nhân "};
//		String Ten[] = {"Hoàng", "Dũng", "Quyền"};
//		String a[] = {"GV", "NC", "PV"};
//		int aa = 0;
//		
//		Random R = new Random();
//		
//		Res.append("form (String fullName, String ID, birthDay(d/MM/yyyy), int type, int workProgress)\n");
//		for (String x: Ho) {
//			int i = 0;
//			for (String y:TenDem) {
//				for (String z: Ten) {
//					i++;
//					Res.append(x + y + z + ", "+ a[aa] + i + ", ");
//					Integer O =new Integer(R.nextInt(12) + 1);
//					String S = O < 10?"0" + O.toString():O.toString() ;
//					Res.append((R.nextInt(30)+1) + "/" + S + "/" + (R.nextInt(1990-1960+1)+1960));
//					Res.append(", " + (aa+1));
//					if (aa!=1)
//						Res.append(", " + (R.nextInt(400-300+1)+300) );
//					else
//						Res.append(", " + (R.nextInt(15-0+1)) );
//					Res.append("\n");
//				}
//			}
//			aa++;
//		}
//		return Res.toString();
//	}
//	
//    public static void main(String[] args) throws Exception {
//        FileWriter writer = new FileWriter("src/preprocess/data1.txt");
//        BufferedWriter buffer = new BufferedWriter(writer);
//        buffer.write(taoXau());
//        buffer.close();
//        System.out.println("Success...");
//        
//    }
//}