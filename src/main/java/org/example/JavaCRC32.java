package org.example;

import java.util.zip.CRC32;

public class JavaCRC32 {
    public static void main(final String[] args) {
        if (args.length <= 0) {
            throw new IllegalArgumentException("Missing input argument");
        }

        final String input = args[0];
        final CRC32 crc = new CRC32();
        crc.update(input.getBytes());

        System.out.println("input: " + input);
        System.out.println("CRC32: " + Long.toHexString(crc.getValue()));
    }
}
