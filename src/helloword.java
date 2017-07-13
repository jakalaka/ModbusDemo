

public class helloword {
	public static void main(String[] args){
//		int rst = ModbusUtil.readDigitalInput("192.168.31.188",10000,254,0);
//		System.out.println("DI1:"+rst);
//
//		rst = ModbusUtil.readInputRegister("192.168.3.204",10000,254,0);
//		System.out.println("AI1:"+rst);
//
		
		ModbusUtil.writeDigitalOutput("192.168.31.188",10000,254,3,1);
		System.out.println("打开第一路继电器");
//
//		rst = ModbusUtil.readDigitalOutput("192.168.3.204",10000,254,0);
//		System.out.println("第一路继电器"+((rst==1)?"打开":"关闭"));
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ModbusUtil.writeDigitalOutput("192.168.31.188",10000,254,3,0);
		System.out.println("关闭第一路继电器");

//		rst = ModbusUtil.readDigitalOutput("192.168.3.204",10000,254,0);
//		System.out.println("第一路继电器"+((rst==1)?"打开":"关闭"));
//		try {
//			Thread.sleep(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		
		
        System.out.println("你好");
    }
}
