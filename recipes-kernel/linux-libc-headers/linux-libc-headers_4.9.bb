require recipes-kernel/linux-libc-headers/linux-libc-headers.inc

PR_append = ".smarc2"

BRANCH = "eec-kernel"

SRCREV = "1115acb5c72894e4828727de3e2fe542ec535bce"

SRC_URI = "${EMB_KERNEL_MIRROR};protocol=ssh;branch=${BRANCH} \
"
S = "${WORKDIR}/git"
