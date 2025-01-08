class Gato extends Mascotas {
        private String color;
        private boolean peloLargo;
        
        public Gato(String nombrerel, int edad, String estado, String fechaNacimiento, 
                    String color, boolean peloLargo) {
            super(nombrerel, edad, estado, fechaNacimiento);
            this.color = color;
            this.peloLargo = peloLargo;
        }
        public void muestra() {
            System.out.println("Soy un gato y me llamo " + nombrerel);
        }
        @Override
        void cumpleaños() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'cumpleaños'");
        }
        @Override
        void morir() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'morir'");
        }
        @Override
        void habla() {
            // TODO Auto-generated method stub
            throw new UnsupportedOperationException("Unimplemented method 'habla'");
        }
}
