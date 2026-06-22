package com.hemanth.springdemo.q7.runner;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.hemanth.springdemo.q7.entity.Sales;
import com.hemanth.springdemo.q7.repository.SalesRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Q7Runner
        implements CommandLineRunner {

    private final SalesRepository repository;

    public Q7Runner(
            SalesRepository repository) {

        this.repository = repository;
    }

    @Override
public void run(String... args) {

    // 7(a)
    List<Sales> sales =
            repository.findByProductProId(
                    101
            );

    System.out.println(
            "\nSales For Product 101"
    );

    for(Sales sale : sales) {

        System.out.println(
                sale.getSaleId()
                + " "
                + sale.getQuantity()
                + " "
                + sale.getPricePerUnit()
        );
    }

    // 7(b)

    System.out.println(
            "\nQuantity Between 5 and 15"
    );

    List<Sales> rangeSales =
            repository.findByQuantityBetween(
                    5,
                    15
            );

    for(Sales sale : rangeSales) {

        System.out.println(
                sale.getSaleId()
                + " "
                + sale.getQuantity()
        );
    }

    // 7(c)
    System.out.println(
        "\nSales Below Current Product Price"
);

List<Sales> discountedSales =
        repository.findSalesBelowCurrentPrice();

for(Sales sale : discountedSales) {

    System.out.println(
            sale.getSaleId()
            + " "
            + sale.getPricePerUnit()
            + " < "
            + sale.getProduct().getPrice()
    );
}

    // 7(d)
    System.out.println(
        "\nSales Sorted By Quantity"
);

List<Sales> sortedSales =
        repository.findAllByOrderByQuantityAsc();

for(Sales sale : sortedSales) {

    System.out.println(
            sale.getSaleId()
            + " "
            + sale.getQuantity()
    );
}

/////////////////////////////////

System.out.println(
        "\nSecond Page Size 4"
);

Page<Sales> page =
        repository.findAll(
                PageRequest.of(
                        1,
                        4
                )
        );

for(Sales sale :
        page.getContent()) {

    System.out.println(
            sale.getSaleId()
            + " "
            + sale.getQuantity()
    );
}


}
}