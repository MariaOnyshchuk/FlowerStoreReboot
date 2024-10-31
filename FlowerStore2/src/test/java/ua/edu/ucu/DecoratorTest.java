package ua.edu.ucu;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.edu.ucu.model.BasketDecorator;
import ua.edu.ucu.model.Item;
import ua.edu.ucu.model.PaperDecorator;
import ua.edu.ucu.model.RibbonDecorator;

class DecoratorTest {
    private Item baseItem;

    @BeforeEach
    void setUp() {
        baseItem = new Item() {
            @Override
            public double price() {
                return 100.0; // base price of item
            }

            @Override
            public String getDescription() {
                return "Basic Item";
            }
        };
    }

    @Test
    void testPaperDecorator() {
        Item decoratedItem = new PaperDecorator(baseItem);
        assertEquals("Paper decoration for Basic Item", decoratedItem.getDescription());
        assertEquals(113.0, decoratedItem.price());
    }

    @Test
    void testRibbonDecorator() {
        Item decoratedItem = new RibbonDecorator(baseItem);

        assertEquals("Ribbon decoration for Basic Item", decoratedItem.getDescription());
        assertEquals(140.0, decoratedItem.price());
    }

    @Test
    void testBasketDecorator() {
        Item decoratedItem = new BasketDecorator(baseItem);

        assertEquals("Basket decoration for Basic Item", decoratedItem.getDescription());
        assertEquals(104.0, decoratedItem.price());
    }

    @Test
    void testCombinedDecorators() {
        Item decoratedItem = new PaperDecorator(new RibbonDecorator(new BasketDecorator(baseItem)));

        assertEquals("Paper decoration for Ribbon decoration for Basket decoration for Basic Item",
                decoratedItem.getDescription());
        assertEquals(157.0, decoratedItem.price());
    }
}
