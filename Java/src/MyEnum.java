public enum MyEnum {

    VALUE {
        @Override
        public void syso() {
            System.out.println("VALUE syso");
        }

		@Override
		public void sayHello() {
			// TODO Auto-generated method stub
			
		}
    },

    SPECIAL_VALUE {
        @Override
        public void syso() {
            System.out.println("SPECIAL_VALUE syso");
        }
        @Override
        public void sayHello() {
            System.out.println("Hello");
        }
    };

    public abstract void syso();
    public abstract void sayHello();

    public static void main(String... args) {
        MyEnum.VALUE.syso();
        MyEnum.SPECIAL_VALUE.syso();
        MyEnum.SPECIAL_VALUE.sayHello();
    }

}