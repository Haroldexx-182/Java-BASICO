package ExtraccionVariable;

public class GoodMain {

    // Extraccion de Variables

    public class Main {

        void printProductPrice(Order order) {

            // 1. precio total de los productos
            Double quantityPrice = order.getPrecio() * order.getQuantity();

            // 2. descuento
            Double offerPrice = order.getPrecio() * order.getOffer();

            // 3. precio final = precio total menos descuento
            Double finalPrice = quantityPrice - offerPrice;

            // 4. calculo del precio del envio
            Double shippingPrice = order.getShipping() * 2;

            // TODO - 4.1 nuevo calculo

            // 5. precio final
            System.out.println(finalPrice + shippingPrice);
        }

    }
}
