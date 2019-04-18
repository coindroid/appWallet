package com.coinomi.core.coins;

import com.coinomi.core.coins.families.BitFamily;

/**
 * @author main@m42.cx
 */
public class TwinsMain extends BitFamily {
    private TwinsMain() {
        id = "twins.main"; // Do not change this id as wallets serialize this string



        addressHeader = 73;
        p2shHeader = 83;
        acceptableAddressCodes = new int[] { addressHeader, p2shHeader };
        spendableCoinbaseDepth = 100;
        dumpedPrivateKeyHeader = 191;

        name = "TWINS";
        symbol = "TWINS";
        uriScheme = "twins";
        bip44Index = 0;
        unitExponent = 8;
        feeValue = value(500000);
        minNonDust = value(1000); // 0.00001 DASH mininput
        softDustLimit = value(5000); // 0.001 DASH
        softDustPolicy = SoftDustPolicy.BASE_FEE_FOR_EACH_SOFT_DUST_TXO;
        signedMessageHeader = toBytes("Twins Signed Message:\n");

    }

    private static TwinsMain instance = new TwinsMain();
    public static synchronized CoinType get() {
        return instance;
    }
}
