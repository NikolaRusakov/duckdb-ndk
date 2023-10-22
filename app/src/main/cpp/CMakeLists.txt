# For more information about using CMake with Android Studio, read the
# documentation: https://d.android.com/studio/projects/add-native-code.html

# Sets the minimum version of CMake required to build the native library.

cmake_minimum_required(VERSION 3.18.1)
# include_directories(${CMAKE_CURRENT_SOURCE_DIR}/../include)
# include_directories(${CMAKE_CURRENT_SOURCE_DIR}/duckdb/src/include)
# include_directories(${CMAKE_CURRENT_SOURCE_DIR}/duckdb/src/include)
# include_directories(${CMAKE_CURRENT_SOURCE_DIR}/duckdb/third_party)
# include_directories(${CMAKE_CURRENT_SOURCE_DIR}/duckdb/third_party/mbedtls)

include_directories(${CMAKE_CURRENT_SOURCE_DIR}/duckdb/src/include)
include_directories(${CMAKE_CURRENT_SOURCE_DIR}/duckdb/third_party/fsst)
include_directories(${CMAKE_CURRENT_SOURCE_DIR}/duckdb/third_party/fmt/include)
include_directories(${CMAKE_CURRENT_SOURCE_DIR}/duckdb/third_party/hyperloglog)
include_directories(${CMAKE_CURRENT_SOURCE_DIR}/duckdb/third_party/fastpforlib)
include_directories(${CMAKE_CURRENT_SOURCE_DIR}/duckdb/third_party/fast_float)
include_directories(${CMAKE_CURRENT_SOURCE_DIR}/duckdb/third_party/re2)
include_directories(${CMAKE_CURRENT_SOURCE_DIR}/duckdb/third_party/miniz)
include_directories(${CMAKE_CURRENT_SOURCE_DIR}/duckdb/third_party/utf8proc/include)
include_directories(${CMAKE_CURRENT_SOURCE_DIR}/duckdb/third_party/miniparquet)
include_directories(${CMAKE_CURRENT_SOURCE_DIR}/duckdb/third_party/concurrentqueue)
include_directories(${CMAKE_CURRENT_SOURCE_DIR}/duckdb/third_party/pcg)
include_directories(${CMAKE_CURRENT_SOURCE_DIR}/duckdb/third_party/tdigest)
include_directories(${CMAKE_CURRENT_SOURCE_DIR}/duckdb/third_party/mbedtls/include)
include_directories(${CMAKE_CURRENT_SOURCE_DIR}/duckdb/third_party/jaro_winkler)

include_directories(${CMAKE_CURRENT_SOURCE_DIR}/duckdb/extension/json/yyjson/include)
include_directories(${CMAKE_CURRENT_SOURCE_DIR}/duckdb/third_party/libpg_query/include)
include_directories(${CMAKE_CURRENT_SOURCE_DIR}/duckdb/extension/json/include)
include_directories(${CMAKE_CURRENT_SOURCE_DIR}/duckdb/extension/parquet/include)
include_directories(${CMAKE_CURRENT_SOURCE_DIR}/duckdb/third_party/httplib)
include_directories(${CMAKE_CURRENT_SOURCE_DIR}/duckdb/third_party/thrift)
include_directories(${CMAKE_CURRENT_SOURCE_DIR}/duckdb/third_party/thrift/thrift)
include_directories(${CMAKE_CURRENT_SOURCE_DIR}/duckdb/third_party/parquet)
include_directories(${CMAKE_CURRENT_SOURCE_DIR}/duckdb/third_party/zstd/include/zstd/common)
include_directories(${CMAKE_CURRENT_SOURCE_DIR}/duckdb/third_party/snappy)
include_directories(${CMAKE_CURRENT_SOURCE_DIR}/duckdb/third_party/zstd/include/zstd/common)
include_directories(${CMAKE_CURRENT_SOURCE_DIR}/duckdb/third_party/zstd/include)
include_directories(${CMAKE_CURRENT_SOURCE_DIR}/duckdb/third_party/zstd/compress)
include_directories(${CMAKE_CURRENT_SOURCE_DIR}/duckdb/third_party/zstd/decompress)
include_directories(${CMAKE_CURRENT_SOURCE_DIR}/duckdb/extension/icu/third_party/icu/i18n/unicode)
include_directories(${CMAKE_CURRENT_SOURCE_DIR}/duckdb/extension/icu/third_party/icu/i18n)
include_directories(${CMAKE_CURRENT_SOURCE_DIR}/duckdb/extension/icu/third_party/icu/common/unicode)
include_directories(${CMAKE_CURRENT_SOURCE_DIR}/duckdb/extension/icu/third_party/icu/common)

# Declares and names the project.

project("duckdb_ndk")

# Creates and names a library, sets it as either STATIC
# or SHARED, and provides the relative paths to its source code.
# You can define multiple libraries, and CMake builds them for you.
# Gradle automatically packages shared libraries with your APK.

#set_target_properties(duckdb_ndk PROPERTIES IMPORTED_LOCATION ${CMAKE_CURRENT_SOURCE_DIR}/../jniLibs/${ANDROID_ABI}/libduckdb_ndk.so)
# set_target_properties(lib_opencv PROPERTIES IMPORTED_LOCATION ${CMAKE_CURRENT_SOURCE_DIR}/../src/main/jniLibs/${ANDROID_ABI}/libduckdb_ndk.so)

#add_subdirectory(duckdb)

#set( 
#SOURCES
#)

add_library( # Sets the name of the library.
        duckdb_ndk

        # Sets the library as a shared library.
        SHARED

        # Provides a relative path to your source file(s).
        "duckdb/ub_src_catalog.cpp"
        "duckdb/ub_src_catalog_catalog_entry.cpp"
        "duckdb/ub_src_catalog_default.cpp"
        "duckdb/ub_src_common_adbc.cpp"
        "duckdb/ub_src_common_adbc_nanoarrow.cpp"
        "duckdb/ub_src_common.cpp"
        "duckdb/ub_src_common_arrow_appender.cpp"
        "duckdb/ub_src_common_arrow.cpp"
        "duckdb/ub_src_common_crypto.cpp"
        "duckdb/ub_src_common_enums.cpp"
        "duckdb/ub_src_common_operator.cpp"
        "duckdb/ub_src_common_progress_bar.cpp"
        "duckdb/ub_src_common_row_operations.cpp"
        "duckdb/ub_src_common_serializer.cpp"
        "duckdb/ub_src_common_sort.cpp"
        "duckdb/ub_src_common_types.cpp"
        "duckdb/ub_src_common_types_column.cpp"
        "duckdb/ub_src_common_types_row.cpp"
        "duckdb/ub_src_common_value_operations.cpp"
        "duckdb/src/common/vector_operations/boolean_operators.cpp"
        "duckdb/src/common/vector_operations/comparison_operators.cpp"
        "duckdb/src/common/vector_operations/generators.cpp"
        "duckdb/src/common/vector_operations/is_distinct_from.cpp"
        "duckdb/src/common/vector_operations/null_operations.cpp"
        "duckdb/src/common/vector_operations/numeric_inplace_operators.cpp"
        "duckdb/src/common/vector_operations/vector_cast.cpp"
        "duckdb/src/common/vector_operations/vector_copy.cpp"
        "duckdb/src/common/vector_operations/vector_hash.cpp"
        "duckdb/src/common/vector_operations/vector_storage.cpp"
        "duckdb/ub_src_core_functions_aggregate_algebraic.cpp"
        "duckdb/ub_src_core_functions_aggregate_distributive.cpp"
        "duckdb/ub_src_core_functions_aggregate_holistic.cpp"
        "duckdb/ub_src_core_functions_aggregate_nested.cpp"
        "duckdb/ub_src_core_functions_aggregate_regression.cpp"
        "duckdb/ub_src_core_functions.cpp"
        "duckdb/ub_src_core_functions_scalar_bit.cpp"
        "duckdb/ub_src_core_functions_scalar_blob.cpp"
        "duckdb/ub_src_core_functions_scalar_date.cpp"
        "duckdb/ub_src_core_functions_scalar_debug.cpp"
        "duckdb/ub_src_core_functions_scalar_enum.cpp"
        "duckdb/ub_src_core_functions_scalar_generic.cpp"
        "duckdb/ub_src_core_functions_scalar_list.cpp"
        "duckdb/ub_src_core_functions_scalar_map.cpp"
        "duckdb/ub_src_core_functions_scalar_math.cpp"
        "duckdb/ub_src_core_functions_scalar_operators.cpp"
        "duckdb/ub_src_core_functions_scalar_random.cpp"
        "duckdb/ub_src_core_functions_scalar_string.cpp"
        "duckdb/ub_src_core_functions_scalar_struct.cpp"
        "duckdb/ub_src_core_functions_scalar_union.cpp"
        "duckdb/ub_src_execution.cpp"
        "duckdb/ub_src_execution_expression_executor.cpp"
        "duckdb/ub_src_execution_index_art.cpp"
        "duckdb/ub_src_execution_index.cpp"
        "duckdb/ub_src_execution_nested_loop_join.cpp"
        "duckdb/ub_src_execution_operator_aggregate.cpp"
        "duckdb/ub_src_execution_operator_csv_scanner.cpp"
        "duckdb/ub_src_execution_operator_csv_scanner_sniffer.cpp"
        "duckdb/ub_src_execution_operator_filter.cpp"
        "duckdb/ub_src_execution_operator_helper.cpp"
        "duckdb/ub_src_execution_operator_join.cpp"
        "duckdb/ub_src_execution_operator_order.cpp"
        "duckdb/ub_src_execution_operator_persistent.cpp"
        "duckdb/ub_src_execution_operator_projection.cpp"
        "duckdb/ub_src_execution_operator_scan.cpp"
        "duckdb/ub_src_execution_operator_schema.cpp"
        "duckdb/ub_src_execution_operator_set.cpp"
        "duckdb/ub_src_execution_physical_plan.cpp"
        "duckdb/ub_src_function_aggregate_distributive.cpp"
        "duckdb/ub_src_function_aggregate.cpp"
        "duckdb/ub_src_function.cpp"
        "duckdb/ub_src_function_cast.cpp"
        "duckdb/ub_src_function_cast_union.cpp"
        "duckdb/ub_src_function_pragma.cpp"
        "duckdb/ub_src_function_scalar_compressed_materialization.cpp"
        "duckdb/ub_src_function_scalar.cpp"
        "duckdb/ub_src_function_scalar_generic.cpp"
        "duckdb/ub_src_function_scalar_list.cpp"
        "duckdb/ub_src_function_scalar_operators.cpp"
        "duckdb/ub_src_function_scalar_sequence.cpp"
        "duckdb/ub_src_function_scalar_string.cpp"
        "duckdb/ub_src_function_scalar_string_regexp.cpp"
        "duckdb/ub_src_function_scalar_struct.cpp"
        "duckdb/ub_src_function_scalar_system.cpp"
        "duckdb/ub_src_function_table_arrow.cpp"
        "duckdb/ub_src_function_table.cpp"
        "duckdb/ub_src_function_table_system.cpp"
        "duckdb/ub_src_function_table_version.cpp"
        "duckdb/ub_src_main.cpp"
        "duckdb/ub_src_main_capi.cpp"
        "duckdb/ub_src_main_capi_cast.cpp"
        "duckdb/ub_src_main_chunk_scan_state.cpp"
        "duckdb/ub_src_main_extension.cpp"
        "duckdb/ub_src_main_relation.cpp"
        "duckdb/ub_src_main_settings.cpp"
        "duckdb/ub_src_optimizer.cpp"
        "duckdb/ub_src_optimizer_compressed_materialization.cpp"
        "duckdb/ub_src_optimizer_join_order.cpp"
        "duckdb/ub_src_optimizer_matcher.cpp"
        "duckdb/ub_src_optimizer_pullup.cpp"
        "duckdb/ub_src_optimizer_pushdown.cpp"
        "duckdb/ub_src_optimizer_rule.cpp"
        "duckdb/ub_src_optimizer_statistics_expression.cpp"
        "duckdb/ub_src_optimizer_statistics_operator.cpp"
        "duckdb/ub_src_parallel.cpp"
        "duckdb/ub_src_parser.cpp"
        "duckdb/ub_src_parser_constraints.cpp"
        "duckdb/ub_src_parser_expression.cpp"
        "duckdb/ub_src_parser_parsed_data.cpp"
        "duckdb/ub_src_parser_query_node.cpp"
        "duckdb/ub_src_parser_statement.cpp"
        "duckdb/ub_src_parser_tableref.cpp"
        "duckdb/ub_src_parser_transform_constraint.cpp"
        "duckdb/ub_src_parser_transform_expression.cpp"
        "duckdb/ub_src_parser_transform_helpers.cpp"
        "duckdb/ub_src_parser_transform_statement.cpp"
        "duckdb/ub_src_parser_transform_tableref.cpp"
        "duckdb/ub_src_planner.cpp"
        "duckdb/ub_src_planner_binder_expression.cpp"
        "duckdb/ub_src_planner_binder_query_node.cpp"
        "duckdb/ub_src_planner_binder_statement.cpp"
        "duckdb/ub_src_planner_binder_tableref.cpp"
        "duckdb/ub_src_planner_expression.cpp"
        "duckdb/ub_src_planner_expression_binder.cpp"
        "duckdb/ub_src_planner_filter.cpp"
        "duckdb/ub_src_planner_operator.cpp"
        "duckdb/ub_src_planner_subquery.cpp"
        "duckdb/ub_src_storage.cpp"
        "duckdb/ub_src_storage_buffer.cpp"
        "duckdb/ub_src_storage_checkpoint.cpp"
        "duckdb/ub_src_storage_compression.cpp"
        "duckdb/ub_src_storage_compression_chimp.cpp"
        "duckdb/ub_src_storage_metadata.cpp"
        "duckdb/ub_src_storage_serialization.cpp"
        "duckdb/ub_src_storage_statistics.cpp"
        "duckdb/ub_src_storage_table.cpp"
        "duckdb/ub_src_transaction.cpp"
        "duckdb/src/verification/copied_statement_verifier.cpp"
        "duckdb/src/verification/deserialized_statement_verifier.cpp"
        "duckdb/src/verification/external_statement_verifier.cpp"
        "duckdb/src/verification/no_operator_caching_verifier.cpp"
        "duckdb/src/verification/parsed_statement_verifier.cpp"
        "duckdb/src/verification/prepared_statement_verifier.cpp"
        "duckdb/src/verification/statement_verifier.cpp"
        "duckdb/src/verification/unoptimized_statement_verifier.cpp"
        "duckdb/third_party/fmt/format.cc"
        "duckdb/third_party/fsst/fsst_avx512.cpp"
        "duckdb/third_party/fsst/libfsst.cpp"
        "duckdb/third_party/miniz/miniz.cpp"
        "duckdb/third_party/re2/re2/bitstate.cc"
        "duckdb/third_party/re2/re2/compile.cc"
        "duckdb/third_party/re2/re2/dfa.cc"
        "duckdb/third_party/re2/re2/filtered_re2.cc"
        "duckdb/third_party/re2/re2/mimics_pcre.cc"
        "duckdb/third_party/re2/re2/nfa.cc"
        "duckdb/third_party/re2/re2/onepass.cc"
        "duckdb/third_party/re2/re2/parse.cc"
        "duckdb/third_party/re2/re2/perl_groups.cc"
        "duckdb/third_party/re2/re2/prefilter.cc"
        "duckdb/third_party/re2/re2/prefilter_tree.cc"
        "duckdb/third_party/re2/re2/prog.cc"
        "duckdb/third_party/re2/re2/re2.cc"
        "duckdb/third_party/re2/re2/regexp.cc"
        "duckdb/third_party/re2/re2/set.cc"
        "duckdb/third_party/re2/re2/simplify.cc"
        "duckdb/third_party/re2/re2/stringpiece.cc"
        "duckdb/third_party/re2/re2/tostring.cc"
        "duckdb/third_party/re2/re2/unicode_casefold.cc"
        "duckdb/third_party/re2/re2/unicode_groups.cc"
        "duckdb/third_party/re2/util/rune.cc"
        "duckdb/third_party/re2/util/strutil.cc"
        "duckdb/third_party/hyperloglog/hyperloglog.cpp"
        "duckdb/third_party/hyperloglog/sds.cpp"
        "duckdb/third_party/fastpforlib/bitpacking.cpp"
        "duckdb/third_party/utf8proc/utf8proc.cpp"
        "duckdb/third_party/utf8proc/utf8proc_wrapper.cpp"
        "duckdb/third_party/libpg_query/pg_functions.cpp"
        "duckdb/third_party/libpg_query/postgres_parser.cpp"
        "duckdb/third_party/libpg_query/src_backend_nodes_list.cpp"
        "duckdb/third_party/libpg_query/src_backend_nodes_makefuncs.cpp"
        "duckdb/third_party/libpg_query/src_backend_nodes_value.cpp"
        "duckdb/third_party/libpg_query/src_backend_parser_gram.cpp"
        "duckdb/third_party/libpg_query/src_backend_parser_parser.cpp"
        "duckdb/third_party/libpg_query/src_backend_parser_scan.cpp"
        "duckdb/third_party/libpg_query/src_backend_parser_scansup.cpp"
        "duckdb/third_party/libpg_query/src_common_keywords.cpp"
        "duckdb/third_party/mbedtls/library/asn1parse.cpp"
        "duckdb/third_party/mbedtls/library/base64.cpp"
        "duckdb/third_party/mbedtls/library/bignum.cpp"
        "duckdb/third_party/mbedtls/library/constant_time.cpp"
        "duckdb/third_party/mbedtls/library/md.cpp"
        "duckdb/third_party/mbedtls/library/oid.cpp"
        "duckdb/third_party/mbedtls/library/pem.cpp"
        "duckdb/third_party/mbedtls/library/pk.cpp"
        "duckdb/third_party/mbedtls/library/pk_wrap.cpp"
        "duckdb/third_party/mbedtls/library/pkparse.cpp"
        "duckdb/third_party/mbedtls/library/platform_util.cpp"
        "duckdb/third_party/mbedtls/library/rsa.cpp"
        "duckdb/third_party/mbedtls/library/rsa_alt_helpers.cpp"
        "duckdb/third_party/mbedtls/library/sha1.cpp"
        "duckdb/third_party/mbedtls/library/sha256.cpp"
        "duckdb/third_party/mbedtls/library/sha512.cpp"
        "duckdb/third_party/mbedtls/mbedtls_wrapper.cpp"
        "duckdb/extension/parquet/parquet_extension.cpp"
        "duckdb/extension/parquet/column_writer.cpp"
        "duckdb/extension/parquet/serialize_parquet.cpp"
        "duckdb/extension/parquet/parquet_reader.cpp"
        "duckdb/extension/parquet/parquet_timestamp.cpp"
        "duckdb/extension/parquet/parquet_writer.cpp"
        "duckdb/extension/parquet/column_reader.cpp"
        "duckdb/extension/parquet/parquet_statistics.cpp"
        "duckdb/extension/parquet/parquet_metadata.cpp"
        "duckdb/extension/parquet/zstd_file_system.cpp"
        "duckdb/third_party/parquet/parquet_constants.cpp"
        "duckdb/third_party/parquet/parquet_types.cpp"
        "duckdb/third_party/thrift/thrift/protocol/TProtocol.cpp"
        "duckdb/third_party/thrift/thrift/transport/TTransportException.cpp"
        "duckdb/third_party/thrift/thrift/transport/TBufferTransports.cpp"
        "duckdb/third_party/snappy/snappy.cc"
        "duckdb/third_party/snappy/snappy-sinksource.cc"
        "duckdb/third_party/zstd/decompress/zstd_ddict.cpp"
        "duckdb/third_party/zstd/decompress/huf_decompress.cpp"
        "duckdb/third_party/zstd/decompress/zstd_decompress.cpp"
        "duckdb/third_party/zstd/decompress/zstd_decompress_block.cpp"
        "duckdb/third_party/zstd/common/entropy_common.cpp"
        "duckdb/third_party/zstd/common/fse_decompress.cpp"
        "duckdb/third_party/zstd/common/zstd_common.cpp"
        "duckdb/third_party/zstd/common/error_private.cpp"
        "duckdb/third_party/zstd/common/xxhash.cpp"
        "duckdb/third_party/zstd/compress/fse_compress.cpp"
        "duckdb/third_party/zstd/compress/hist.cpp"
        "duckdb/third_party/zstd/compress/huf_compress.cpp"
        "duckdb/third_party/zstd/compress/zstd_compress.cpp"
        "duckdb/third_party/zstd/compress/zstd_compress_literals.cpp"
        "duckdb/third_party/zstd/compress/zstd_compress_sequences.cpp"
        "duckdb/third_party/zstd/compress/zstd_compress_superblock.cpp"
        "duckdb/third_party/zstd/compress/zstd_double_fast.cpp"
        "duckdb/third_party/zstd/compress/zstd_fast.cpp"
        "duckdb/third_party/zstd/compress/zstd_lazy.cpp"
        "duckdb/third_party/zstd/compress/zstd_ldm.cpp"
        "duckdb/third_party/zstd/compress/zstd_opt.cpp"
        "duckdb/extension/icu/./icu-makedate.cpp"
        "duckdb/extension/icu/./icu-strptime.cpp"
        "duckdb/extension/icu/./icu_extension.cpp"
        "duckdb/extension/icu/./icu-datepart.cpp"
        "duckdb/extension/icu/./icu-timezone.cpp"
        "duckdb/extension/icu/./icu-timebucket.cpp"
        "duckdb/extension/icu/./icu-list-range.cpp"
        "duckdb/extension/icu/./icu-datetrunc.cpp"
        "duckdb/extension/icu/./icu-table-range.cpp"
        "duckdb/extension/icu/./icu-dateadd.cpp"
        "duckdb/extension/icu/./icu-datefunc.cpp"
        "duckdb/extension/icu/./icu-datesub.cpp"
        "duckdb/ub_extension_icu_third_party_icu_common.cpp"
        "duckdb/ub_extension_icu_third_party_icu_i18n.cpp"
        "duckdb/extension/icu/third_party/icu/stubdata/stubdata.cpp"
        "duckdb/extension/json/buffered_json_reader.cpp"
        "duckdb/extension/json/json_enums.cpp"
        "duckdb/extension/json/json_extension.cpp"
        "duckdb/extension/json/json_common.cpp"
        "duckdb/extension/json/json_functions.cpp"
        "duckdb/extension/json/json_scan.cpp"
        "duckdb/extension/json/json_serializer.cpp"
        "duckdb/extension/json/json_deserializer.cpp"
        "duckdb/extension/json/serialize_json.cpp"
        "duckdb/ub_extension_json_json_functions.cpp"
        "duckdb/extension/json/yyjson/yyjson.cpp"
        )

# Searches for a specified prebuilt library and stores the path as a
# variable. Because CMake includes system libraries in the search path by
# default, you only need to specify the name of the public NDK library
# you want to add. CMake verifies that the library exists before
# completing its build.

find_library( # Sets the name of the path variable.
        log-lib

        # Specifies the name of the NDK library that
        # you want CMake to locate.
        log)

# Specifies libraries CMake should link to your target library. You
# can link multiple libraries, such as libraries you define in this
# build script, prebuilt third-party libraries, or system libraries.

target_link_libraries( # Specifies the target library.
        duckdb_ndk

        # Links the target library to the log library
        # included in the NDK.
        ${log-lib})