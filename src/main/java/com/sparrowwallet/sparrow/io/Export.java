package com.sparrowwallet.sparrow.io;

import com.sparrowwallet.drongo.wallet.WalletModel;

public interface Export {
    String getName();
    WalletModel getWalletModel();
}
