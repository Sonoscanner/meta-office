SUMMARY = "A collection of multi-dimensional data structures and indexing algorithms"
HOMEPAGE = "https://gitlab.com/mdds/mdds"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=60a6093677ded88b5e28677e52a0c011"

inherit autotools-brokensep pkgconfig

SRC_URI = " \
    git://gitlab.com/mdds/mdds.git;protocol=https;branch=master \
    file://0001-configure.ac-remove-fixed-paths-causing-trouble-when.patch \
"
PV = "3.2.1"
SRCREV = "74ceeec9d502a6137404837fea2bc6a7327ae8d6"
S = "${WORKDIR}/git"

DEPENDS = "boost"

BBCLASSEXTEND = "native"
