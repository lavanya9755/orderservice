-- it has naming convection V<number> __<name>.sql
CREATE TABLE t_order (
    id BIGINT(20) NOT NULL AUTO_INCREMENT PRIMARY KEY,
    order_number VARCHAR(255) DEFAULT NULL,
    sku_code VARCHAR(255),
    price DECIMAL(19,2)
);

-- problem with mysql manually 
-- | Problem                  | Explanation                                                           |
-- | ------------------------ | --------------------------------------------------------------------- |
-- | ❌ No History             | No way to track what DB changes were made and when.                   |
-- | ❌ Easy to Forget         | Devs may forget to apply the SQL on their local or staging DB.        |
-- | ❌ Error-Prone            | Running manual SQL can lead to inconsistent schemas.                  |
-- | ❌ Team Chaos             | In a team, if Dev A changes DB but Dev B doesn't know — things break. |
-- | ❌ No CI/CD Compatibility | Hard to apply DB changes automatically when deploying code.           |
